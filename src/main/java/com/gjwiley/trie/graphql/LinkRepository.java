package com.gjwiley.trie.graphql;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class LinkRepository {

    private final Random rng = new SecureRandom();
    
    private final List<Link> links;

    private String randomId() {
        return String.valueOf(rng.nextLong()) + String.valueOf(rng.nextLong());
    }
    
    private void add(String url, String description) {
        links.add(new Link(randomId(), url, description));
    }
    
    public LinkRepository() {
        this.links = new ArrayList<>();
        // add some links to start off with
        this.add("http://howtographql.com", "Your favorite GraphQL page");
        this.add("http://graphql.org/learn/", "The official docks");
    }

    public List<Link> getAllLinks() {
        return this.links;
    }

    public void saveLink(final Link link) {
        this.links.add(link);
    }
}