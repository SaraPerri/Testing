import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main testing = new Main();

    @Test
    void formatDate() {
        String result = testing.formatDate("2023-03-01T13:00:00Z");
        assert result.equals("1 Mar 2023");
    }
    @Test
    void formatDate1() {
        String result = testing.formatDate("2023-03-01T13:00:00Z");
        assert result.equals("Uno Marzo 2023");
    }

}