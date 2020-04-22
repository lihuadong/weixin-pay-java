
/**
 * 微信支付-Java版本
 * xiaochengxu.pay
 * WechatPayConfig.java
 * Ver0.0.1
 * 2017年10月13日-下午12:48:53
 * 2014~2020全智道(北京)科技有限公司-版权所有
 * 
 */

/**
 * 微信支付-Java版本
 * 微信支付的通用类，根据小程序发起的支付请求
 * 响应对应的参数，供小程序本地调起微信支付功能 
 * 
 */


package weixin.pay.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WechatPay
 */
@WebServlet("/pay/WechatPay")
public class WechatPay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WechatPay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
