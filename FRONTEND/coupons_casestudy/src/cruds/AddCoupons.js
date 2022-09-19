import React from "react";
import { useState, useEffect } from "react";
import { useLocation } from "react-router-dom";
import { Link,useNavigate, useParams } from "react-router-dom";
import CompanyService from "../services/CompanyService";

const AddCoupons = () => {
  
  const [comName, setComName] = useState("");
  const [location, setLocation] = useState("");
  const [product_category, setProduct_Category] = useState("");
  const [coupon_code, setCoupon_code] = useState("");
  const [coupon_set_name, setCoupon_Set_Name] = useState("");
  const [discount_amount, setDiscount_amount] = useState("");
  const [product_id, setProduct_id] = useState("");
  const [product_name, setProduct_name] = useState("");
  const [price, setPrice] = useState("");
  const getuserid = useLocation()//checks for any received value from any component(here board-company-component)
  const navigate = useNavigate();
  const { company_id } = useParams();

  const saveCoupons= (o) => {
    o.preventDefault();
    const company= {comName,location,product_category,
                  coupon_code,coupon_set_name, discount_amount, product_id, product_name,price,company_id};

    /*if (company_id) {
      //update
      CompanyService.update(company)
        .then((responsed) => {
          alert("Coupon Data Updated successfully!");
          console.log("Coupon data updated successfully", responsed.data);
        })
        .catch((error) => {
          console.log("Something went wrong", error);
        });*/
        if(getuserid.state)
        {
            CompanyService.update(getuserid.state,company).then((responsed)=>{
                console.log("updated",responsed.data)
            }).catch((error)=>{
                console.log(error);
            })
        
    } else {
      // create
      CompanyService.create(company)
        .then((response) => {
          alert("Coupon Saved");
          console.log("Coupon has been added successfully", response.data);
        })
        .catch((error) => {
          console.log("Something went wrong", error);
        });
    }
  };

  useEffect(() => {
    if (company_id) {
      CompanyService.get(company_id)
        .then((company) => {
          setComName(company.data.comName);
          setLocation(company.data.location);
          setProduct_Category(company.data.product_category);
          setCoupon_code(company.data.coupon_code);
          setCoupon_Set_Name(company.data.coupon_set_name)
                    setDiscount_amount(company.data.discount_amount);
                   setProduct_id(company.data.product_id);
                  setProduct_name(company.data.product_name);
                  setPrice(company.data.price);
          
        })
        .catch((error) => {
          console.log("Something went wrong", error);
        });
    }
  }, []);

  return (
    <div className="container">
      <br></br>
      <h3 className="ab">
        <b>
          <u>Add/Update Coupons</u>
        </b>
      </h3>
      <form className="form1">
        
        
        <br></br>
        <div className="form-group">
          {/* <p className="prsub">Product Name:</p> */}
          <input
            type="text"
            className="form-control col-1"
            id="comname"
            value={comName}
            onChange={(o) => setComName(o.target.value)}
            placeholder="Enter Company Name"
          />
        </div>


        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-2"
            id="location"
            value={location}
            onChange={(o) =>setLocation(o.target.value)}
            placeholder="Enter location"
          />
        </div>
       
    
        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-3"
            id="productcate"
            value={product_category}
            onChange={(o) =>setProduct_Category(o.target.value)}
            placeholder="Enter product category"
          />
        </div>
        
      
        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-4"
            id="coucode"
            value={coupon_code}
            onChange={(o) =>setCoupon_code(o.target.value)}
            placeholder="Enter Coupon Code"
          />
        </div>
       
      
        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-5"
            id="discountmnt"
            value={discount_amount}
            onChange={(o) =>setDiscount_amount(o.target.value)}
            placeholder="Enter Discount Amount"
          />
        </div>
      
  
        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-6"
            id="productid"
            value={product_id}
            onChange={(o) =>setProduct_id(o.target.value)}
            placeholder="Enter product ID"
          />
        </div>
        

        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-7"
            id="productname"
            value={product_name}
            onChange={(o) =>setProduct_name(o.target.value)}
            placeholder="Enter product name"
          />
        </div>
        

        <div className="form-group">
          {/* <p className="prsub">Product Price:</p> */}
          <input
            type="text"
            className="form-control col-8"
            id="price"
            value={price}
            onChange={(o) =>setPrice(o.target.value)}
            placeholder="Enter price"
          />
        </div>
        
    
        <div>
          <button onClick={(o) => saveCoupons(o)} id="svep">
            Save
          </button>
          <Link to="/coupons">
            <button className="bckc">Back To list</button>
          </Link>
        </div>
      </form>
    </div>
  );
};

export default AddCoupons;
