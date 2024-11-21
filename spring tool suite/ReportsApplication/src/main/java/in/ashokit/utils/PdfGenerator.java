package in.ashokit.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.ashokit.entity.CitizenPlan;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class PdfGenerator {
public void generate(HttpServletResponse response, List<CitizenPlan> plans) throws Exception{
	Document document = new Document(PageSize.A4);
	PdfWriter.getInstance(document, response.getOutputStream());
	document.open();
	
	//creating font
	//setting font size and style
	Font fontTitle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	fontTitle.setSize(20);
	
	//creating paragraph
	Paragraph paragraph = new Paragraph("Citizen Plans", fontTitle);
	
	//alligning the paragraph in document
	paragraph.setAlignment(Paragraph.ALIGN_CENTER);
	
	//adding the created paragraph in document
	document.add(paragraph);
	
	PdfPTable table = new PdfPTable(6);
	table.setSpacingBefore(5);
	
	table.addCell("Id");
	table.addCell("Citizen Name");
	table.addCell("Plan Name");
	table.addCell("Plan Status");
	table.addCell("Start Date");
	table.addCell("End Date");
	
	for(CitizenPlan plan: plans) {
	table.addCell(String.valueOf(plan.getCitizenId()));
	table.addCell(plan.getCitizenName());
	table.addCell(plan.getPlanName());
	table.addCell(plan.getPlanStatus());
	table.addCell(plan.getPlanStartDate()+"");
	table.addCell(plan.getPlanEndDate()+"");
	}
	document.add(table);
	document.close();
}
}
