/**
 * Mziyanda Mwanda
 * 215133765
 * ADP3
 * Cap stone
 * */
package za.ac.cput.Entity;

public class UserPayment {
    public String userId, paymentId;

    public UserPayment(Builder builder){
        this.userId = builder.userId;
        this.paymentId = builder.paymentId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                '}';
    }

    public static class Builder{
        private String userId, paymentId;

        public Builder setUserId(String userId){
            this.userId = userId;

            return this;
        }

        public Builder setPaymentId(){
            this.paymentId = paymentId;

            return this;
        }


        public UserPayment build(){

            return new UserPayment(this);
        }

        public Builder copy(UserPayment userPayment){
            this.userId = userPayment.userId;
            this.paymentId = userPayment.paymentId;

            return this;
        }



    }
}
