import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.StringTokenizer;
import java.sql.*;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2004
 * Company:
 * @author Manojit Paul & Lubana Papia Shelim
 * @version 1.0
 */

public class Desktop extends JFrame{

  JDesktopPane pane=new JDesktopPane();
  JMenuBar menu = new JMenuBar();

  JMenu mnuForm = new JMenu("Forms");
  JMenu mnuReports = new JMenu("Reports");
  JMenu mnuWindow = new JMenu("Window Exit");

  JMenu mnuPatient = new JMenu("Patient");
  JMenu mnuSurgery = new JMenu("Surgery");
  JMenu mnuPersonnel = new JMenu("Doctor and Nurse Information");
  JMenu mnuDuty = new JMenu("Duty Scheduling");
  JMenu mnuGeneral = new JMenu("General Information Entry");

  JMenu mnuPatientRep = new JMenu("Patient Related");
  JMenu mnuDoctor = new JMenu("Doctor Related");
  JMenu mnuNurse = new JMenu("Nurse Related");
  JMenu mnuSurgeryRep = new JMenu("Surgery Related");
  JMenu mnuDutyRep = new JMenu("Duty Related");

  JMenuItem mniPatAdmission = new JMenuItem("Patient Admission");
  JMenuItem mniUnits = new JMenuItem("Hospital Units");
  JMenuItem mniShift = new JMenuItem("Duty Shifts");
  JMenuItem mniOperation = new JMenuItem("Operation Name Entry");
  JMenuItem mniDutySection = new JMenuItem("Nurse's Duty Section");
  JMenuItem mniOT = new JMenuItem("Operation Theater");
  JMenuItem mniNurse = new JMenuItem("Nurse Information Entry");
  JMenuItem mniDoctor = new JMenuItem("Doctor Information Entry");
  JMenuItem mniBed = new JMenuItem("Bed Information Entry");
  JMenuItem mniNurseDuty = new JMenuItem("Nurse Duty Scheduling");
  JMenuItem mniDoctorDuty = new JMenuItem("Doctor Duty Scheduling");
  JMenuItem mniSurgeryScheduling = new JMenuItem("Surgery Scheduling");
  JMenuItem mniSurgeryBill = new JMenuItem("Surgery Bill");
  JMenuItem mniDischarge = new JMenuItem("Patient Discharging");
  JMenuItem mniBilling = new JMenuItem("Patient Billing");

  JMenuItem mniSinglePatientAdmission = new JMenuItem("Admission Report for a Patient");
  JMenuItem mniPatientBill = new JMenuItem("Patient Bill");
  JMenuItem mniPatAdmissionOnDate = new JMenuItem("Patient Admission on a Date");
  JMenuItem mniPatAdmissionOnDateRange = new JMenuItem("Patient Admission on Date Range");
  JMenuItem mniPatUnderTreatment = new JMenuItem("Patients Under Treatment");

  JMenuItem mniAllDoctorRep = new JMenuItem("Doctors in the Hospital");
  JMenuItem mniConsultantsRep = new JMenuItem("Consultants of the Hospital");
  JMenuItem mniMedOffRep = new JMenuItem("Medical Officers in the Hospital");

  JMenuItem mniAllNurseRep = new JMenuItem("Nurses in the Hospital");

  JMenuItem mniSurgerySchedulingRep = new JMenuItem("Surgery Schedule Report");
  JMenuItem mniSurgeryBillRep = new JMenuItem("Surgery Bill Report");
  JMenuItem mniSurgeryOnDate = new JMenuItem("Surgery on a Date");
  JMenuItem mniSurgeryOnDateRange = new JMenuItem("Surgery on Date Range");

  JMenuItem mniNurseDutyOnDate = new JMenuItem("Nurses' Duty on a Date");
  JMenuItem mniNurseDutyOnDateShift = new JMenuItem("Nurses' Duty on Date & Shift");
  JMenuItem mniDoctorDutyOnDate = new JMenuItem("Medical Officers' Duty on a Date");

  JMenuItem mniExit = new JMenuItem("Exit");

  DbCon db;
  ResultSet rs;

  ConnectionSpecification cs = new ConnectionSpecification("PDNMS");

  public Desktop() {
    setTitle("PDNMS");
    Container c=getContentPane();

    db = new DbCon();

    c.add(pane);

    pane.setBorder(BorderFactory.createLoweredBevelBorder());

    setJMenuBar(menu);

    menu.add(mnuForm);
    menu.add(mnuReports);
    menu.add(mnuWindow);

    mnuForm.add(mnuPatient);
    mnuForm.add(mnuSurgery);
    mnuForm.add(mnuPersonnel);
    mnuForm.add(mnuDuty);
    mnuForm.add(mnuGeneral);

    mnuPatient.add(mniPatAdmission);
    mnuPatient.add(mniBilling);
    mnuPatient.add(mniDischarge);

    mnuSurgery.add(mniSurgeryScheduling);
    mnuSurgery.add(mniSurgeryBill);

    mnuPersonnel.add(mniDoctor);
    mnuPersonnel.add(mniNurse);

    mnuDuty.add(mniDoctorDuty);
    mnuDuty.add(mniNurseDuty);

    mnuGeneral.add(mniBed);
    mnuGeneral.add(mniOperation);
    mnuGeneral.add(mniOT);
    mnuGeneral.add(mniShift);
    mnuGeneral.add(mniDutySection);
    mnuGeneral.add(mniUnits);

    mnuReports.add(mnuPatientRep);
    mnuReports.add(mnuDoctor);
    mnuReports.add(mnuNurse);
    mnuReports.add(mnuSurgeryRep);
    mnuReports.add(mnuDutyRep);

    mnuPatientRep.add(mniSinglePatientAdmission);
    mnuPatientRep.add(mniPatientBill);
    mnuPatientRep.add(mniPatAdmissionOnDate);
    mnuPatientRep.add(mniPatAdmissionOnDateRange);
    mnuPatientRep.add(mniPatUnderTreatment);

    mnuDoctor.add(mniAllDoctorRep);
    mnuDoctor.add(mniConsultantsRep);
    mnuDoctor.add(mniMedOffRep);

    mnuNurse.add(mniAllNurseRep);

    mnuSurgeryRep.add(mniSurgerySchedulingRep);
    mnuSurgeryRep.add(mniSurgeryBillRep);
    mnuSurgeryRep.add(mniSurgeryOnDate);
    mnuSurgeryRep.add(mniSurgeryOnDateRange);

    mnuDutyRep.add(mniNurseDutyOnDate);
    mnuDutyRep.add(mniNurseDutyOnDateShift);
    mnuDutyRep.add(mniDoctorDutyOnDate);

    mnuWindow.add(mniExit);

    mniExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        int option = JOptionPane.showConfirmDialog(null,"Are you sure to exit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION) {
          System.exit(0);
        }
      }
    });

    mniPatAdmission.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        PatientAdmission pa = new PatientAdmission();
        pane.add(pa);
      }
    });

    mniUnits.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        HospitalUnit hu = new HospitalUnit();
        pane.add(hu);
      }
    });

    mniShift.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Shift sft = new Shift();
        pane.add(sft);
      }
    });

    mniOperation.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        OperationName operationName = new OperationName();
        pane.add(operationName);
      }
    });

    mniDutySection.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        NurseDutySection nds = new NurseDutySection();
        pane.add(nds);
      }
    });

    mniOT.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        OperationTheater ot = new OperationTheater();
        pane.add(ot);
      }
    });

    mniNurse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Nurse nurse = new Nurse();
        pane.add(nurse);
      }
    });

    mniDoctor.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Doctor doctor = new Doctor();
        pane.add(doctor);
      }
    });

    mniBed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Bed bed = new Bed();
        pane.add(bed);
      }
    });

    mniNurseDuty.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        NurseDuty nd = new NurseDuty();
        pane.add(nd);
      }
    });

    mniDoctorDuty.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        DoctorDuty dd = new DoctorDuty();
        pane.add(dd);
      }
    });

    mniSurgeryScheduling.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        SurgeryScheduling surgeryScheduling = new SurgeryScheduling();
        pane.add(surgeryScheduling);
      }
    });

    mniSurgeryBill.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        SurgeryBill surgeryBill = new SurgeryBill();
        pane.add(surgeryBill);
      }
    });

    mniDischarge.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        PatientDischarging pd = new PatientDischarging();
        pane.add(pd);
      }
    });

    mniBilling.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        PatientBilling pb = new PatientBilling();
        pane.add(pb);
      }
    });

    mniConsultantsRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Report.exec("D:\\PDNMS\\reports\\Consultants",cs,Report.OUTPUT_TO_WINDOW,"{doctor.type} = \"Consultant\"",new String[] {""});
      }
    });

    mniAllDoctorRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Report.exec("D:\\PDNMS\\reports\\AllDoctor",cs,Report.OUTPUT_TO_WINDOW,"",new String[] {""});
      }
    });

    mniSurgerySchedulingRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String id = JOptionPane.showInputDialog(null,"Enter Surgery ID","Surgery ID Input",JOptionPane.INFORMATION_MESSAGE);
        Report.exec("D:\\PDNMS\\reports\\SurgeryReport",cs,Report.OUTPUT_TO_WINDOW,"{surgery.surgery_id} = \""+id+"\"",new String[] {""});
      }
    });

    mniSurgeryBillRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String id = JOptionPane.showInputDialog(null,"Enter Surgery ID","Surgery ID Input",JOptionPane.INFORMATION_MESSAGE);
        Report.exec("D:\\PDNMS\\reports\\SurgeryBill",cs,Report.OUTPUT_TO_WINDOW,"{surgery.surgery_id} = \""+id+"\"",new String[] {""});
      }
    });

    mniMedOffRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Report.exec("D:\\PDNMS\\reports\\MedicalOfficers",cs,Report.OUTPUT_TO_WINDOW,"{doctor.type} = \"Medical Officer\"",new String[] {""});
      }
    });

    mniAllNurseRep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Report.exec("D:\\PDNMS\\reports\\AllNurse",cs,Report.OUTPUT_TO_WINDOW,"",new String[] {""});
      }
    });

    mniSinglePatientAdmission.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String pReg = JOptionPane.showInputDialog(null,"Enter Patient Registration Number","Input",JOptionPane.INFORMATION_MESSAGE);
        Report.exec("D:\\PDNMS\\reports\\PatientAdmission",cs,Report.OUTPUT_TO_WINDOW,"{patient.p_reg_no} = '"+pReg+"'",new String[] {""});
      }
    });

    mniPatAdmissionOnDate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item[i] = st.nextToken();
          i++;
        }
        Report.exec("D:\\PDNMS\\reports\\PatientAdmissionOnDate",cs,Report.OUTPUT_TO_WINDOW,"{Patient.Date_of_Admission} = DateTime("+item[2]+","+item[0]+","+item[1]+")",new String[] {""});
      }
    });

    mniPatAdmissionOnDateRange.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item1[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item1[i] = st.nextToken();
          i++;
        }
        String firstDate = "DateTime("+item1[2]+","+item1[0]+","+item1[1]+")";
        date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        st = new StringTokenizer(date,"/");
        String item2[] = new String[3];
        i = 0;
        while(st.hasMoreTokens()) {
          item2[i] = st.nextToken();
          i++;
        }
        String secondDate = "DateTime("+item2[2]+","+item2[0]+","+item2[1]+")";
        Report.exec("D:\\PDNMS\\reports\\PatientAdmissionOnDateRange",cs,Report.OUTPUT_TO_WINDOW,"{Patient.Date_of_Admission} in "+firstDate+" to "+secondDate,new String[] {""});
      }
    });

    mniPatUnderTreatment.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Report.exec("D:\\PDNMS\\reports\\CurrentPatient",cs,Report.OUTPUT_TO_WINDOW,"{patient.status} = Yes",new String[] {""});
      }
    });

    mniSurgeryOnDate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item[i] = st.nextToken();
          i++;
        }
        Report.exec("D:\\PDNMS\\reports\\SurgeryOnDate",cs,Report.OUTPUT_TO_WINDOW,"{Surgery.Operation_date} = DateTime("+item[2]+","+item[0]+","+item[1]+")",new String[] {""});
      }
    });

    mniSurgeryOnDateRange.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item1[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item1[i] = st.nextToken();
          i++;
        }
        String firstDate = "DateTime("+item1[2]+","+item1[0]+","+item1[1]+")";
        date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        st = new StringTokenizer(date,"/");
        String item2[] = new String[3];
        i = 0;
        while(st.hasMoreTokens()) {
          item2[i] = st.nextToken();
          i++;
        }
        String secondDate = "DateTime("+item2[2]+","+item2[0]+","+item2[1]+")";
        Report.exec("D:\\PDNMS\\reports\\SurgeryOnDateRange",cs,Report.OUTPUT_TO_WINDOW,"{surgery.Operation_date} in "+firstDate+" to "+secondDate,new String[] {""});
      }
    });

    mniNurseDutyOnDate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item[i] = st.nextToken();
          i++;
        }
        Report.exec("D:\\PDNMS\\reports\\NurseDuty",cs,Report.OUTPUT_TO_WINDOW,"{nurse_duty.Duty_date} = DateTime("+item[2]+","+item[0]+","+item[1]+")",new String[] {""});
      }
    });

    mniNurseDutyOnDateShift.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        try {
          String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
          StringTokenizer st = new StringTokenizer(date,"/");
          String item[] = new String[3];
          int i = 0;
          while(st.hasMoreTokens()) {
            item[i] = st.nextToken();
            i++;
          }
          String sql = "select shift_time from shift";
          rs = db.sqlQuery(sql);
          rs.last();
          i = rs.getRow();
          rs.beforeFirst();
          String shifts[] = new String[i];
          int index = 0;
          while(rs.next()) {
            shifts[index] = rs.getString("shift_time");
            index++;
          }
          String shiftTime = (String) JOptionPane.showInputDialog(null,"Enter Shift","Shift",JOptionPane.INFORMATION_MESSAGE,null,shifts,shifts[0]);
          Report.exec("D:\\PDNMS\\reports\\NurseDuty",cs,Report.OUTPUT_TO_WINDOW,"{nurse_duty.Duty_date} = DateTime("+item[2]+","+item[0]+","+item[1]+") and {shift.shift_time} = \""+shiftTime+"\"",new String[] {""});
        }
        catch(Exception ex) {
          System.out.println("Error 5: "+ex);
        }
      }
    });

    mniDoctorDutyOnDate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String date = JOptionPane.showInputDialog(null,"Enter Date [Format: Month/Date/Year (5/22/2004)]","Input Date",JOptionPane.INFORMATION_MESSAGE);
        StringTokenizer st = new StringTokenizer(date,"/");
        String item[] = new String[3];
        int i = 0;
        while(st.hasMoreTokens()) {
          item[i] = st.nextToken();
          i++;
        }
        Report.exec("D:\\PDNMS\\reports\\DoctorDuty",cs,Report.OUTPUT_TO_WINDOW,"{doctor_duty.Duty_date} = DateTime("+item[2]+","+item[0]+","+item[1]+")",new String[] {""});
      }
    });

    mniPatientBill.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        try {
          String pReg = JOptionPane.showInputDialog(null,"Enter Patient Registration No.","Input",JOptionPane.INFORMATION_MESSAGE);
          String sql = "select patient_type from patient where p_reg_no = '"+pReg+"'";
          rs = db.sqlQuery(sql);
          rs.next();
          ConnectionSpecification cs = new ConnectionSpecification("PDNMS");
          if(rs.getString("patient_type").equalsIgnoreCase("Surgery")) {
            Report.exec("D:\\PDNMS\\reports\\PatientBillSurgery",cs,Report.OUTPUT_TO_WINDOW,"{patient.p_reg_no} = '"+pReg+"'",new String[] {""});
          }
          else if(rs.getString("patient_type").equalsIgnoreCase("Medication")) {
            Report.exec("D:\\PDNMS\\reports\\PatientBillMed",cs,Report.OUTPUT_TO_WINDOW,"{patient.p_reg_no} = '"+pReg+"'",new String[] {""});
          }
        }
        catch(Exception ex) {
          System.out.println("Error 6: "+ex);
        }
      }
    });

    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(d.width,d.height);
    show();
  }

  public static void main(String[] args) {
    Desktop desktop1 = new Desktop();
  }

}