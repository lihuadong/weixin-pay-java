package weixin.pay;

public class PayByQRUrlTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayByQRUrl  qrUrl  = new PayByQRUrl("prd_002",PayConfig.KEY);
		String url  = qrUrl.getPayUrl();
		System.out.println(url);

	}

}
