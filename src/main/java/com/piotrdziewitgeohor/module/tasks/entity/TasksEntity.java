package com.piotrdziewitgeohor.module.tasks.entity;

import javax.persistence.*;
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
    private LocalDateTime orderedOn;
    //data opracowania
    private LocalDateTime dateOfDevelopment;
    //data wykonania w terenie
    private LocalDateTime dateOfExecutionInTheField;
    //temat zlecenia
    private String taskTitle;
    //obiekt w obrebie ktorego bedzie wykonywane zlecenia, np. numer drogi lub numer kolizji
    private String taskObject;
    //poczatek zakresu zlecenia - zazwyczaj w formacie 00+000.00
    private String startMileage;
    //koniec zakresu zlecenia - zazwyczaj w formacie 00+000.00
    private String endMileage;
    //odcinek - jesli obiekt składa się z wiecej niz jednego odcinka, jesli jeden to pozostaje puste
    private Integer section;
    //oznaczenie branzy
    private AssortmentType assortmentType;
    //szczegolowe oznaczenie asortymentu/branzy
    private AssortmentDetails assortmentDetails;
    //numer operatu w formacie assortmentType+koljeny numer z danego sortymentu
    private String documentNumber;
    //typ zlecenia
    private TaskType taskType;
    //czy wykonane
    private boolean IsDone;
    //wskazowki dla terenowcow
    private String fieldSurveyorTip;
   }
