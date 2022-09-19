import React, { useEffect, useState } from "react";
import "./Homestyle.css";

import { useNavigate } from "react-router-dom";
import CompanyService from "../services/CompanyService";
function Homepage() {
  const navlogin = useNavigate();
  /* const handleDelete = (id) => {
    console.log("Printing id", id);
    service
      .removeorder(id)
      .then((response) => {
        console.log("order deleted successfully", response.data);
        order_list();
      })
      .catch((error) => {
        console.log("Something went wrong", error);
      });
  } */
  const [allcoupons,setAllcoupons] = useState([])
  const showAllcoupons = () =>{
    CompanyService.getAll().then((couponresponse)=> {
      setAllcoupons(couponresponse.data)
    })
  }
  useEffect(()=>{
    showAllcoupons()
    console.log(allcoupons);
  },[])
  return (
    
    <div className="homedesign">
      <div >
      <br></br>
      <center><table className="tabledesign" border={3}>
      <thead style={{color:"rgb(3, 4, 114)"}}>
        <tr>
          <td>Company Name</td>
          <td>location</td>
          <td>Product Category</td>
          <td>Coupon Code</td>
          <td>Coupon Discount</td>
          <td>Product ID</td>
          <td>Product Name</td>
          <td>Price</td>
          <td>redeem</td>
        </tr>
      </thead>
      <tbody>
      {
          allcoupons.map((company,index)=>(
            <tr>
            <td>{company.comName}</td>
                <td>{company.location}</td>
                <td>{company.product_category}</td>
                <td>{company.coupon_code}</td>
                <td>{company.discount_amount}</td>
                 <td>{company.product_id}</td>
                 <td>{company.product_name}</td>
                 <td>{company.price}</td>
            <td><button className="btn btn-outline-primary" onClick={()=>
            {
              window.alert("Please Login to redeem");
              navlogin("/login");
            }}>Redeem</button></td>
            </tr>
          ))
        }
        </tbody>
      </table>
      </center>
      </div>
    </div> 
    
  );
}

export default Homepage;