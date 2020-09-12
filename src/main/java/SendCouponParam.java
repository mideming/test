import java.io.Serializable;

public class SendCouponParam implements Serializable {
    private static final long serialVersionUID = 1570024378338404856L;
    private String stock_id;
    private String out_request_no;

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }
}
