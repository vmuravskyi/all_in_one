package design_patterns.design_patterns_other.other.factory.factoryExample.webSites;

import design_patterns.design_patterns_other.other.factory.factoryExample.pages.AboutPage;
import design_patterns.design_patterns_other.other.factory.factoryExample.pages.CommentPage;
import design_patterns.design_patterns_other.other.factory.factoryExample.pages.ContactPage;
import design_patterns.design_patterns_other.other.factory.factoryExample.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
