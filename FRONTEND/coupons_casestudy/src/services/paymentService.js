import httpClient from "../http-common3";

const paymentgateway = () => {
  return httpClient.post("/pgredirect");
};

export default(paymentgateway)
