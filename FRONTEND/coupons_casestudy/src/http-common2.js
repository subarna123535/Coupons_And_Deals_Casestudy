import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8008/cnd",
  headers: {
    "Content-Type": "application/json",
  },
});
