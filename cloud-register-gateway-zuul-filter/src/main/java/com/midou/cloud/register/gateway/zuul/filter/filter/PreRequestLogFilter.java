package com.midou.cloud.register.gateway.zuul.filter.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Filter;

/**
 * @author midou
 * @description
 * @date 2018/10/13 15:35
 * @modified by
 */
public class PreRequestLogFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public String filterType() {
        //"pre"类型过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //在PreDecorationFilter之前执行
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("send {} requtest to {}", request.getMethod(), request.getRequestURI().toString());
        return null;
    }
}
