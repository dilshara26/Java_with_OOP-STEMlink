package UpcastingTute;

class GraduateStudent extends Student {
    private boolean hasAnInternship;

    public GraduateStudent(String name, int rollNumber, int age, boolean hasAnInternship) {
        super(name, rollNumber, age);
        this.hasAnInternship = hasAnInternship;
    }

    public boolean getHasAnInternship() {
        return hasAnInternship;
    }

    public void setHasAnInternship(boolean hasAnInternship) {
        this.hasAnInternship = hasAnInternship;
    }

    @Override
    public void isEligibleForGraduation() {
        System.out.println("Student has already graduated");
    }
}