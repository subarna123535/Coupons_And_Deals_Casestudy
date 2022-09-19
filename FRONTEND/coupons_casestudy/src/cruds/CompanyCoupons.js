import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import CouponList from "./CouponList";
import AddCoupons from "./AddCoupons";
import NotFound from "./NotFound";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function Coupon() {
  return (
    <BrowserRouter>
      
        <div>
          <Routes>
            <Route  path="/coupons" element={<CouponList />} />
            <Route path="/addcoupons" element={<AddCoupons />} />
            <Route path="/coupons/edit/:company_id" element={<AddCoupons />} />
            <Route path="/*" element={<NotFound />} />
          </Routes>
        </div>
      
    </BrowserRouter>
  );
}
export default Coupon;
