package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  | 중점과목 | 점수  | \n";
	public static final String LINE = "------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getRport() {
		
		ArrayList<Subject> subjectList = school.getSubjectList();	// 모든 과목에 대한 성적 산출 
		for ( Subject subject : subjectList ) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();	// String 으로 반환 
		
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();	// 각 과목의 학생들 
		
		for ( int i = 0 ; i < studentList.size() ; i++ ) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(" " + student.getMajorSubejct().getSubjectName() + " ");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.getSubjectId());
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubejct().getSubjectId();
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for ( int i = 0 ; i < scoreList.size() ; i++ ) {	// 학생들이 가진 점수들 
			
			Score score = scoreList.get(i);
			
			if ( score.getSubject().getSubjectId() == subjectId ) {		// 현재 학점 산출할 과목 
				String grade;
				if ( score.getSubject().getSubjectId() == majorId ) {
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
			
		}
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
	
}
