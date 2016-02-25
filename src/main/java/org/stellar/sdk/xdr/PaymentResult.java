// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union PaymentResult switch (PaymentResultCode code)
//  {
//  case PAYMENT_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class PaymentResult  {
  public PaymentResult () {}
  PaymentResultCode code;
  public PaymentResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(PaymentResultCode value) {
    this.code = value;
  }
  public static void encode(XdrDataOutputStream stream, PaymentResult encodedPaymentResult) throws IOException {
  stream.writeInt(encodedPaymentResult.getDiscriminant().getValue());
  switch (encodedPaymentResult.getDiscriminant()) {
  case PAYMENT_SUCCESS:
  break;
  default:
  break;
  }
  }
  public static PaymentResult decode(XdrDataInputStream stream) throws IOException {
  PaymentResult decodedPaymentResult = new PaymentResult();
  PaymentResultCode discriminant = PaymentResultCode.decode(stream);
  decodedPaymentResult.setDiscriminant(discriminant);
  switch (decodedPaymentResult.getDiscriminant()) {
  case PAYMENT_SUCCESS:
  break;
  default:
  break;
  }
    return decodedPaymentResult;
  }
}
