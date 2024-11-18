/*
    void submitToDatabase(String userId, String subject, String question, 
                          String optionA, String optionB, String optionC, 
                          String optionD, String correctOption);
}
class SCDQuiz implements Quiz {
    private String question;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.master;
import java.sql.*;
interface Quiz {
    void submitToDatabase(String userId, String subject, String question, 
                          String optionA, String optionB, String optionC, 
                          String optionD, String correctOption);
}
class SCDQuiz implements Quiz {
    private String question;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

    public SCDQuiz(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    @Override
    public void submitToDatabase(String userId, String subject, String question, 
                                 String optionA, String optionB, String optionC, 
                                 String optionD, String correctOption) {
        // Save quiz to the database
        saveQuizToDatabase(userId, subject, question, optionA, optionB, optionC, optionD, correctOption);
    }

    private void saveQuizToDatabase(String userId, String subject, String question, 
                                    String optionA, String optionB, String optionC, 
                                    String optionD, String correctOption) {
        String query = "INSERT INTO quiz_questions (user_id, subject_name, question_text, option_a, " +
                       "option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, Integer.parseInt(userId));  // Assuming userId is passed as a string and needs to be parsed
            pstmt.setString(2, subject);
            pstmt.setString(3, question);
            pstmt.setString(4, optionA);
            pstmt.setString(5, optionB);
            pstmt.setString(6, optionC);
            pstmt.setString(7, optionD);
            pstmt.setString(8, correctOption);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Question submitted successfully!");
            } else {
                System.out.println("Failed to submit the question.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class AIQuiz implements Quiz {
    private String question;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

    public AIQuiz(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    @Override
    public void submitToDatabase(String userId, String subject, String question, 
                                 String optionA, String optionB, String optionC, 
                                 String optionD, String correctOption) {
        // Save quiz to the database
        saveQuizToDatabase(userId, subject, question, optionA, optionB, optionC, optionD, correctOption);
    }

    private void saveQuizToDatabase(String userId, String subject, String question, 
                                    String optionA, String optionB, String optionC, 
                                    String optionD, String correctOption) {
        String query = "INSERT INTO quiz_questions (user_id, subject_name, question_text, option_a, " +
                       "option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, Integer.parseInt(userId));
            pstmt.setString(2, subject);
            pstmt.setString(3, question);
            pstmt.setString(4, optionA);
            pstmt.setString(5, optionB);
            pstmt.setString(6, optionC);
            pstmt.setString(7, optionD);
            pstmt.setString(8, correctOption);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Question submitted successfully!");
            } else {
                System.out.println("Failed to submit the question.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class FormalMethodsQuiz implements Quiz {
    private String question;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

    public FormalMethodsQuiz(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    @Override
    public void submitToDatabase(String userId, String subject, String question, 
                                 String optionA, String optionB, String optionC, 
                                 String optionD, String correctOption) {
        // Save quiz to the database
        saveQuizToDatabase(userId, subject, question, optionA, optionB, optionC, optionD, correctOption);
    }

    private void saveQuizToDatabase(String userId, String subject, String question, 
                                    String optionA, String optionB, String optionC, 
                                    String optionD, String correctOption) {
        String query = "INSERT INTO quiz_questions (user_id, subject_name, question_text, option_a, " +
                       "option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, Integer.parseInt(userId));
            pstmt.setString(2, subject);
            pstmt.setString(3, question);
            pstmt.setString(4, optionA);
            pstmt.setString(5, optionB);
            pstmt.setString(6, optionC);
            pstmt.setString(7, optionD);
            pstmt.setString(8, correctOption);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Question submitted successfully!");
            } else {
                System.out.println("Failed to submit the question.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class CNQuiz implements Quiz {
    private String question;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

    public CNQuiz(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    @Override
    public void submitToDatabase(String userId, String subject, String question, 
                                 String optionA, String optionB, String optionC, 
                                 String optionD, String correctOption) {
        // Save quiz to the database
        saveQuizToDatabase(userId, subject, question, optionA, optionB, optionC, optionD, correctOption);
    }

    private void saveQuizToDatabase(String userId, String subject, String question, 
                                    String optionA, String optionB, String optionC, 
                                    String optionD, String correctOption) {
        String query = "INSERT INTO quiz_questions (user_id, subject_name, question_text, option_a, " +
                       "option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, Integer.parseInt(userId));
            pstmt.setString(2, subject);
            pstmt.setString(3, question);
            pstmt.setString(4, optionA);
            pstmt.setString(5, optionB);
            pstmt.setString(6, optionC);
            pstmt.setString(7, optionD);
            pstmt.setString(8, correctOption);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Question submitted successfully!");
            } else {
                System.out.println("Failed to submit the question.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class QuizFactory {
    public static Quiz createQuiz(String userId, String subject, String question, 
                                  String optionA, String optionB, String optionC, 
                                  String optionD, String correctOption) {
        switch (subject) {
            case "SCD":
                return new SCDQuiz(question, optionA, optionB, optionC, optionD, correctOption);
            case "AI":
                return new AIQuiz(question, optionA, optionB, optionC, optionD, correctOption);
            case "Formal Methods":
                return new FormalMethodsQuiz(question, optionA, optionB, optionC, optionD, correctOption);
            case "CN":
                return new CNQuiz(question, optionA, optionB, optionC, optionD, correctOption);
            default:
                throw new IllegalArgumentException("Invalid subject");
        }
    }
}

