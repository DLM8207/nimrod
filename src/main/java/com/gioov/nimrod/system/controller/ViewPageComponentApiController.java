package com.gioov.nimrod.system.controller;

import com.gioov.nimrod.common.Common;
import com.gioov.nimrod.common.Url;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gioov.nimrod.user.service.UserService.SYSTEM_ADMIN;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@Controller
@RequestMapping(Url.Page.System.VIEW_PAGE_COMPONENT_API)
public class ViewPageComponentApiController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/SYSTEM/VIEW_PAGE_COMPONENT_API/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Common.trimSlash(Url.Page.System.VIEW_PAGE_COMPONENT_API + "/page_all");
    }

}
