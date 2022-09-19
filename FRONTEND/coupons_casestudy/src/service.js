import httpClient from "./http-common";
class Service
{
    getCustomer()
    {
        return httpClient.get("/mapcontroller/getAlldetails");
    }
    
    

}
 export default new Service();