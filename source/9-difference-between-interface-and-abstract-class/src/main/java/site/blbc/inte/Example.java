package site.blbc.inte;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public class Example {

  private List<Filter> filters = new ArrayList<Filter>();

  public void addFilter(Filter filter) {
    this.filters.add(filter);
  }

  public void handleRpcRequest(RpcRequest req) {
    try {
      for (Filter filter :
          filters) {
        filter.doFilter(req);
      }
    } catch (RpcException e) {
      // 处理过滤异常
    }
    // 省略其他处理逻辑
  }

  public static void main(String[] args) {
    Example example = new Example();
    example.addFilter(new AuthncationFilter());
    example.addFilter(new RateLimitFilter());
    example.handleRpcRequest(new RpcRequest());
  }

}
