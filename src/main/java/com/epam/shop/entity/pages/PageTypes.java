package com.epam.shop.entity.pages;

import com.epam.shop.entity.pages.impl.AdminPage;
import com.epam.shop.entity.pages.impl.ClientPage;
import com.epam.shop.entity.pages.impl.HomePage;

import java.util.HashMap;
import java.util.Map;

/**
 * enum fo page
 */
public enum PageTypes {
    GUEST(new HomePage()),
    CLIENT(new ClientPage()),
    ADMIN(new AdminPage());

    private Page page;

    PageTypes(Page page) {
        this.page = page;
    }

    /**
     * Getter for page
     * @return page that user needs
     */
    public Page getPage() {
        return page;
    }

    private static final Map<String, PageTypes> lookup = new HashMap<>();

    static {
        for (PageTypes env : PageTypes.values()) {
            lookup.put(env.toString(), env);
        }
    }

    /**
     * Return page by type
     * @param type type of page
     * @return page that user needs
     */
    public static PageTypes pageTypes(String type) {
        return lookup.get(type);
    }
}
