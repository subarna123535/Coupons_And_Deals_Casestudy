import React, { Component } from "react";
import UserService from "../services/user.service";
import { useState,useEffect } from "react";
import CompanyService from "../services/CompanyService";
import "./board-user.component.css";
import axios from "axios";

const BoardUser = ()=>{
  /* constructor(props) {
    super(props);
    this.state = {
      content: ""
    };
  }
  componentDidMount() {
    UserService.getUserBoard().then(
      response => {
        this.setState({
          content: response.data
        });
      },
      error => {
        this.setState({
          content:
            (error.response &&
              error.response.data &&
              error.response.data.message) ||
            error.message ||
            error.toString()
        });
      }
    );
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
    
    <div className="landingbase">
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
          <td>Actions</td>
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
            <td>
              
          
            
            <a href={`http://localhost:9090/`} className="btn btn-outline-primary"
            >Redeem</a>
        
            
            
            </td>
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
export default BoardUser;
//className="btn btn-outline-primary"