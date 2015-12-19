package com.nytimes.storedemo.store.article;


import com.nytimes.storedemo.model.RedditData;
import com.nytimes.storedemo.store.base.Store;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class ArticleStore extends Store<RedditData> {

    @Inject
    public ArticleStore(ArticleNetworkDAO networkDAO) {
        super(networkDAO);
    }
}
