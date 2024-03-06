/*import { Address } from './address';
import { Photo } from './photo';*/

import java.util.Date;
import java.util.List;


/*export class User {
    birthdate: Date;
    size: number;
    photos: Photo[];
    address: Address; 
}*/

// TS to JAVA

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Address address;
    // getters and setters

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}