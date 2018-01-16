package com.gjwiley.trie.graphql;

import java.util.ArrayList;
import java.util.List;

class LinkRepository {

    private final List<Link> links;

    public LinkRepository() {
        this.links = new ArrayList<>();
        // add some links to start off with
        this.links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        this.links.add(new Link("http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> getAllLinks() {
        return this.links;
    }

    public void saveLink(final Link link) {
        this.links.add(link);
    }
}