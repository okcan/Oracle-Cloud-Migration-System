package com.oraclecloudmigrationsystem.tutorial.spring.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.lang.ProcessBuilder.Redirect;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.oraclecloudmigrationsystem.tutorial.spring.model.User;

/**
 * @author imssbora
 */
@Controller
public class UserController {

   /*
    * Create new user object for empty from
    */
   
   @ModelAttribute("user")
   public User setUpUserForm() {
      return new User();
   }

   /*
    * Open new registration form
    */
   @GetMapping("/")
   public String registration() {
      
      //return "registrationForm";
      return "index";
   }

   @GetMapping("/amazon")
   public String amazon() {
      
      //return "amazon";
      return "amazon";
   }
   
   @GetMapping("/azure")
   public String azure() {
      
      //return "amazon";
      return "azure";
   }
   
   @GetMapping("/google")
   public String google() {
      
      //return "amazon";
      return "google";
   }
   
   @GetMapping("/registrationForm")
   public String registrationForm() {
      
      //return "amazon";
      return "registrationForm";
   }
   
   @GetMapping("/arayuz")
   public String arayuz() {
      
      //return "amazon";
      return "arayuz";
   }
   
   
   
   /*
    *  Save user object
    */
   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute("user") User user, Model model) throws IOException  {

      // Implement business logic to save user details into a database
      //.....
      
//	   Runtime rt = Runtime.getRuntime();
//		String[] commands = {"C:\\oraclecloudmigrationsystem\\7-Zip\\7z a D:\\vm_ovf\\test.tar.gz D:\\vm_ovf\\test.img"};
		try {
	//		Process proc = rt.exec(commands);
			Runtime.getRuntime().exec("c:\\oraclecloudmigrationsystem\\ovf\\ovftool.exe vi://"+ user.getFirstName()+":"+ user.getPassword()+"@"+ user.getUsername()+" "+ user.getLastName());
		} catch (IOException hata) {
			hata.printStackTrace();
			// TODO Auto-generated catch block
			FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\mylogs.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(hata);

			o.close();
			f.close();
		//	hata.printStackTrace();
			System.out.println("Hata:"+hata);
		}
		
      System.out.println("FirstName : " + user.getFirstName());
      System.out.println("LastName : " + user.getLastName());
      System.out.println("Username : " + user.getUsername());
      System.out.println("Password : " + user.getPassword());
      System.out.println("Email : " + user.getEmail());
      
   //   Runtime.getRuntime().exec("C:\\Program Files\\VMware\\VMware OVF Tool\\ovftool vi://"+ user.getFirstName()+":"+ user.getLastName()+"@"+ user.getUsername()+""+ user.getPassword()+" "+ user.getEmail());
      
      //Process p=
  //    Runtime.getRuntime().exec("C:\\7-Zip\\7z a D:\\vm_ovf\\test.tar.gz D:\\vm_ovf\\test.img"); 
  //    p.waitFor(); 
  //    BufferedReader reader=new BufferedReader(
  //        new InputStreamReader(p.getInputStream())
          
  //    ); 
  //    System.out.println(reader);
     
      
   //   Runtime.getRuntime().exec("ovftool vi://yasins@linkplus.com.tr:zunOrcL!23@10.16.24.84/Linkplus/vm/Yasin/ys-oel7 D:\\vmware\\test.ovf");	  
    	  
  //    Runtime.getRuntime().exec("C:\\qemu-img-win-x64-2_3_0\\qemu-img.exe convert -f raw -O vmdk D:\\vm_ovf\\Kurulmus_Linux_6.4-disk1.vmdk D:\\vm_ovf\\test.img");

   //   Runtime.getRuntime().exec("7z a D:\\vm_ovf\\test.tar.gz D:\\vm_ovf\\test.img");

  //    System.out.println("java -jar ftmcli.jar upload compute_images myImage.tar.gz -C compute_images_segments -U mail.com -A https://yazilim.storage.oraclecloud.com/auth/v1.0 -S Storage -I yazilim");
      
      model.addAttribute("message", "User saved successfully.");

      return "registrationSuccess";
   }
   
   @PostMapping("/qemu")
   public String qemu(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("C:\\oraclecloudmigrationsystem\\qemu-img-win-x64-2_3_0\\qemu-img.exe convert -f raw -O vmdk E:\\myimage\\"+user.getVm_name()+" E:\\myimage\\test.img");
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\qemulogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
   
   @PostMapping("/zip")
   public String zip(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("C:\\oraclecloudmigrationsystem\\7-Zip\\7z a E:\\myimage\\test.tar.gz E:\\myimage\\test.img");
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\ziplogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
   
   @PostMapping("/upload")
   public String upload(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("C:\\oraclecloudmigrationsystem\\jdk1.8.0_144\\bin\\java -jar C:\\oraclecloudmigrationsystem\\ftmcli\\ftmcli.jar upload compute_images myImage.tar.gz -C compute_images_segments -U "+user.getFtm_username()+" -A "+user.getFtm_auth()+" -S Storage -I "+user.getFtm_identity());
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\uploadlogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
   
   @PostMapping("/amazoncon")
   public String amazoncon(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("aws ec2 create-instance-export-task --instance-id "+user.getAws_instance_id()+" --target-environment vmware --export-to-s3-task DiskImageFormat=vmdk,ContainerFormat=ova,S3Bucket="+user.getAws_bucket()+",S3Prefix="+user.getAws_prefix());
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\amazonlogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
   
   @PostMapping("/azurecon")
   public String azurecon(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("C:\\oraclecloudmigrationsystem\\vboxmanage\\VBoxManage.exe clonehd --format vmdk C:\\oraclecloudmigrationsystem\\vm\\"+user.getVhd_name()+" C:\\oraclecloudmigrationsystem\\vm\\test.vmdk");
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\azurelogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
   
   @PostMapping("/googlecon")
   public String googlecon(@ModelAttribute("user") User user, Model model) throws IOException  {
	   
	   try {
			//		Process proc = rt.exec(commands);
					Runtime.getRuntime().exec("C:\\oraclecloudmigrationsystem\\vboxmanage\\VBoxManage.exe convertdd E:\\myimage\\"+user.getGcloud_raw_name()+" E:\\myimage\\test.vmdk --format VMDK");
				} catch (IOException hata) {
					hata.printStackTrace();
					// TODO Auto-generated catch block
					FileOutputStream f = new FileOutputStream(new File("C:\\oraclecloudmigrationsystem\\googlelogs.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);

					// Write objects to file
					o.writeObject(hata);

					o.close();
					f.close();
				//	hata.printStackTrace();
					System.out.println("Hata:"+hata);
				}
   
	   return "registrationSuccess";
   }
}
