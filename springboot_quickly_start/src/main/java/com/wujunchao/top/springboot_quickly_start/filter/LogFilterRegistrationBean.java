package com.wujunchao.top.springboot_quickly_start.filter;

/**
 * @author: wujunchao
 * @date: 2021/07/24 00:38
 */

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LogFilterRegistrationBean extends FilterRegistrationBean<Filter> {
    @Override
    public Filter getFilter() {
        return new LogFilter();
    }

    class LogFilter implements Filter {
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            System.out.println("LogFilter: process " + ((HttpServletRequest) request).getRequestURI());
            chain.doFilter(request, response);
        }
    }
}

