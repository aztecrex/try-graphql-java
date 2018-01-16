package com.gjwiley.trie.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(final LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return this.linkRepository.getAllLinks();
    }
}
