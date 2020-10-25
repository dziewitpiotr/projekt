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


    public Long getTaksId() {
        return taksId;
    }

    public TasksEntity setTaksId(Long taksId) {
        this.taksId = taksId;
        return this;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public TasksEntity setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }

    public Long getFieldSurveyorId() {
        return fieldSurveyorId;
    }

    public TasksEntity setFieldSurveyorId(Long fieldSurveyorId) {
        this.fieldSurveyorId = fieldSurveyorId;
        return this;
    }

    public Long getOfficeSurveyorId() {
        return officeSurveyorId;
    }

    public TasksEntity setOfficeSurveyorId(Long officeSurveyorId) {
        this.officeSurveyorId = officeSurveyorId;
        return this;
    }

    public LocalDateTime getOrderedOn() {
        return orderedOn;
    }

    public TasksEntity setOrderedOn(LocalDateTime orderedOn) {
        this.orderedOn = orderedOn;
        return this;
    }

    public LocalDateTime getDateOfDevelopment() {
        return dateOfDevelopment;
    }

    public TasksEntity setDateOfDevelopment(LocalDateTime dateOfDevelopment) {
        this.dateOfDevelopment = dateOfDevelopment;
        return this;
    }

    public LocalDateTime getDateOfExecutionInTheField() {
        return dateOfExecutionInTheField;
    }

    public TasksEntity setDateOfExecutionInTheField(LocalDateTime dateOfExecutionInTheField) {
        this.dateOfExecutionInTheField = dateOfExecutionInTheField;
        return this;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public TasksEntity setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
        return this;
    }

    public String getTaskObject() {
        return taskObject;
    }

    public TasksEntity setTaskObject(String taskObject) {
        this.taskObject = taskObject;
        return this;
    }

    public String getStartMileage() {
        return startMileage;
    }

    public TasksEntity setStartMileage(String startMileage) {
        this.startMileage = startMileage;
        return this;
    }

    public String getEndMileage() {
        return endMileage;
    }

    public TasksEntity setEndMileage(String endMileage) {
        this.endMileage = endMileage;
        return this;
    }

    public Integer getSection() {
        return section;
    }

    public TasksEntity setSection(Integer section) {
        this.section = section;
        return this;
    }

    public AssortmentType getAssortmentType() {
        return assortmentType;
    }

    public TasksEntity setAssortmentType(AssortmentType assortmentType) {
        this.assortmentType = assortmentType;
        return this;
    }

    public AssortmentDetails getAssortmentDetails() {
        return assortmentDetails;
    }

    public TasksEntity setAssortmentDetails(AssortmentDetails assortmentDetails) {
        this.assortmentDetails = assortmentDetails;
        return this;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public TasksEntity setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public TasksEntity setTaskType(TaskType taskType) {
        this.taskType = taskType;
        return this;
    }

    public boolean isDone() {
        return IsDone;
    }

    public TasksEntity setDone(boolean done) {
        IsDone = done;
        return this;
    }

    public String getTaskTip() {
        return taskTip;
    }

    public TasksEntity setTaskTip(String taskTip) {
        this.taskTip = taskTip;
        return this;
    }
}


