package site.blbc.inte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public interface Filter {

  void doFilter(RpcRequest req) throws RpcException;
}
