package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    // static para q n seja gerado um novo SimpleDateFormat a cada instancia
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)
    {
        if(!checkOut.after(checkIn))
        {
            //throw new IllegalArgumentException("Check-out date must be after check-in date");
            throw new DomainException("Check-out date must be after check-in date");
        }


        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }



    public long duration()
    {
        // gera a diferença entre as datas em milisegundos
        long diff = checkOut.getTime() - checkIn.getTime();
        // converte a diferença de milisegundos para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut)
    {
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now))
        {
            //"retorna" uma excessao (no caso foi usada uma já existente no Java)
            //throw new IllegalArgumentException("Reservation dates for update must be future dates");
            // usando excessao personalizada
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if(!checkOut.after(checkIn))
        {
            //throw new IllegalArgumentException("Check-out date must be after check-in date");
            throw new DomainException("Check-out date must be after check-in date");
        }


        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString()
    {
        return "Room "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkIn)
            + ", check-out: "
            + sdf.format(checkOut)
            + ", "
            + duration()
            + " nights";
    }

}
