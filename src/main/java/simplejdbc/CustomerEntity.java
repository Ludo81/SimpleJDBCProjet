package simplejdbc;

/**
 * Correspond à un enregistrement de la table Customer
 */
public class CustomerEntity {
    
	private int customerId, zip, credit_limit;
        private char discount_code;
	private String name, addressLine1, adressLine2, city, state, phone, fax, email;

	public CustomerEntity(int customerId, int zip, int credit_limit,
                char discount_code,
                String name, String addressLine1, String adressLine2,
                String city, String state, String phone, String fax, String email) {
                    this.customerId = customerId;
                    this.zip = zip;
                    this.credit_limit = credit_limit;
                    this.discount_code = discount_code;
                    this.name = name;
                    this.addressLine1 = addressLine1;
                    this.adressLine2 = adressLine2;
                    this.city = city;
                    this.state = state;
                    this.phone = phone;
                    this.fax= fax;
                    this.email = email;
	}

	public int getCustomerId() {
            return customerId;
	}
        
        public int getZip(){
            return zip;
        }
        
        public int getCredit_limit() {
            return credit_limit;
        }
        
        public char getDiscount_code() {
            return discount_code;
        }
        
	public String getName() {
            return name;
	}

	public String getAddressLine1() {
            return addressLine1;
	}

        public String getAdressLine2(){
            return adressLine2;
        }
        
        public String getCity() {
            return city;
        }
        
        public String getState() {
            return state;
        }
        
        public String getPhone() {
            return phone;
        }
        
        public String getFax() {
            return fax;
        }
        
        public String getEmail() {
            return email;
        }
}
