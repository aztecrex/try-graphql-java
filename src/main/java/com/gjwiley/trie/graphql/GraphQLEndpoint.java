package com.gjwiley.trie.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    private static final long serialVersionUID = 1L;
       
    private static GraphQLSchema buildSchema() {
        final LinkRepository repository = new LinkRepository();
        return SchemaParser.newParser()
            .file("schema.graphqls")
            .resolvers(new Query(repository), new Mutation(repository))
            .build()
            .makeExecutableSchema();
    }
    
    
    public GraphQLEndpoint() {
        super(buildSchema());
    }

    
}