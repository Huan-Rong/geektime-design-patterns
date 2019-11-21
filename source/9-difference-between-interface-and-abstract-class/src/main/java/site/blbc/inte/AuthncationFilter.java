package site.blbc.inte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public class AuthncationFilter implements Filter {

  public void doFilter(RpcRequest req) throws RpcException {
    System.out.println("鉴权过滤...");
  }
}
