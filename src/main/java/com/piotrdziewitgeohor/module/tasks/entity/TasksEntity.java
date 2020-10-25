package com.piotrdziewitgeohor.module.tasks.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name="tasks")
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taksId;

    //id do połaczenia z tabelą uzytkownikow jako zglaszający
    private Long applicantId;

    //id do połaczenia z tabelaąuzytkownikow jako geodeta terenowy
    private Long fieldSurveyorId;

    //id do polaczenia z tabela uzytkownikow jako geodeta biurowy/opracowujacy kameralnie zlecenia
    private Long officeSurveyorId;

    //data zlecenia
    @NotNull
    private LocalDateTime orderedOn;

    //data opracowania
    private LocalDateTime dateOfDevelopment;

    //data wykonania w terenie
    private LocalDateTime dateOfExecutionInTheField;

    //temat zlecenia
    @NotNull(message = "Podaj temat zlecenia nie może być pusty")
    private String taskTitle;

    //obiekt w obrebie ktorego bedzie wykonywane zlecenia, np. numer drogi lub numer kolizji
    @NotNull(message = "Podaj nazwe drogi/kolizji")
    private String taskObject;

    //poczatek zakresu zlecenia - zazwyczaj w formacie 00+000.00
    @NotNull(message = "Podaj przybliżoną lokalizacje")
    private String startMileage;

    //koniec zakresu zlecenia - zazwyczaj w formacie 00+000.00
    private String endMileage;

    //odcinek - jesli obiekt składa się z wiecej niz jednego odcinka, jesli jeden to pozostaje puste
    private Integer section;

    //oznaczenie branzy
    private AssortmentType assortmentType;

    //szczegolowe oznaczenie asortymentu/branzy
    @NotNull(message = "Podaj asortyment zlecenia")
    private AssortmentDetails assortmentDetails;

    //numer operatu w formacie assortmentType+koljeny numer z danego sortymentu
    private String documentNumber;

    //typ zlecenia
    @NotNull(message = "Podaj typ zlecenia")
    private TaskType taskType;

    //czy wykonane
    private boolean IsDone;

    //wskazowki do zlecenia np. godzina, telefon do kogos innego niz wykonawca itp.
    private String taskTip;
   }
