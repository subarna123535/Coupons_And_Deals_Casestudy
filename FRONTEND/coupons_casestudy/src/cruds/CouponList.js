import React from "react";
import { useEffect, useState } from "react";
import "./style.css";
import { Link } from "react-router-dom";
import CompanyService from "../services/CompanyService";

const CouponsList = () => {
  const [company, setCompany] = useState([]);

  const init = () => {
    CompanyService.getAll()
      .then((response) => {
        console.log("Printing Products", response.data);
        setCompany(response.data);
      })
      .catch((error) => {
        console.log("Something went wrong", error);
      });
  };

  useEffect(() => {
    init();
  }, []);

  const handleDelete = (company_id) => {
    alert("Are You Sure ?")
    console.log("Printing id", company_id);
    CompanyService.remove(company_id)
      .then((response) => {
        console.log("Product has been Deleted", response.data);
        init();
      })
      .catch((error) => {
        console.log("Something went wrong", error);
      });
  };

  return (
    <div className="AddCoupon" id="plist">
      <br></br>
      <h3>List of Products</h3>
      <hr />
      <div>
        <Link to="/addcoupons" className="btn  mb-2" id="aprod">
          Add Coupons
        </Link>
        <table className="table table-bordered table-striped" id="tabp">
          <thead className="thead-dark">
          <tr>
          <th>Company Name</th>
          <th>location</th>
          <th>Product Category</th>
          <th>Coupon Code</th>
          <th>Coupon Discount</th>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Price</th>
          <th>Actions</th>
          </tr>
          </thead>
          <tbody>
            {company.map((company) => (
              <tr key={company.company_id}>
                <th>{company.comName}</th>
                <th>{company.location}</th>
                <th>{company.product_category}</th>
                <th>{company.coupon_code}</th>
                <th>{company.discount_amount}</th>
                 <th>{company.product_id}</th>
                 <th>{company.product_name}</th>
                 <th>{company.price}</th>
                  <td>
                  <Link
                    className="btn "
                    id="uprod"
                    to={`/coupons/edit/${company.company_id}`}
                  >
                    Edit 
                  </Link>

                  <button
                    id="dprod"
                    onClick={() => {
                      handleDelete(company.company_id);
                    }}
                  >
                    Delete 
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default CouponsList;
