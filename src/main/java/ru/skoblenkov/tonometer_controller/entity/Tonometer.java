package ru.skoblenkov.tonometer_controller.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@Table(name = "tonometers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tonometer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_number")
    private Integer serialNumber;

    @Column(name = "date_check")
    private Instant dateCheck;

    @Column(name = "date_check_after_completion")
    private Instant dateCheckAfterCompletion;

    @Column(name = "appearance")
    private Boolean appearance;

    @Column(name = "leak")
    private Boolean leak;

    @Column(name = "pressure_error")
    private Boolean pressureError;

    @Column(name = "pulse_error")
    private Boolean pulseError;

    @Column(name = "pressure_simalation")
    private Boolean pressureSimalation;

    @Column(name = "data_transmission")
    private Boolean dataTransmission;

    @Size(max = 255)
    @Column(name = "status")
    private String status;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;

}
