package miniprojeler.kimlikbilgileri;

public class KimlikPojo {


        private String idNumber;
        public String name;
        private String address;
        private String phoneNumber;


        public KimlikPojo(String idNumber, String name, String address, String phoneNumber) {
            this.idNumber= idNumber;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return   "ID Number = "     + idNumber+"\n"   +
                    "Name = "          + name+"\n"       +
                    "Address = "       + address+"\n"    +
                    "Phone Number = "  + phoneNumber ;

        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }
    }

