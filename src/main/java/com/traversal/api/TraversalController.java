package com.traversal.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TraversalController {
    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/traversal")
    public Traversal traversal(@RequestParam(value = "tree", defaultValue = "1-2-3") String treeString){
        return new Traversal(counter.incrementAndGet(), String.format(template, treeString));
    }
}
