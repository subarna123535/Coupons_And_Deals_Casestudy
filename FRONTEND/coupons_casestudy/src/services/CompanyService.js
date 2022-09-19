import httpClient from "../http-common2";

const getAll = () => {
  return httpClient.get("/coupons");
};

const get = (company_id) => {
  return httpClient.get(`/couponsbyId/${company_id}`);
};

const create = (data) => {
  return httpClient.post("/savecoupons", data);
};

const update = (data) => {
  return httpClient.put("/updatecoupons/", data);
};

const remove = (company_id) => {
  return httpClient.delete(`/deletecoupons/${company_id}`);
};

export default { getAll, create, get, update, remove };
