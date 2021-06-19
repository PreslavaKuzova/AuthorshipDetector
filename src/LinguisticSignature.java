public class LinguisticSignature {
    private double averageWordLength;
    private double typeTokenRatio;
    private double hapaxLegomenaRatio;
    private double averageSentenceLength;
    private double averageSentenceComplexity;

    public LinguisticSignature(double averageWordLength, double typeTokenRatio, double hapaxLegomenaRatio, double averageSentenceLength, double averageSentenceComplexity) {
        this.averageWordLength = averageWordLength;
        this.typeTokenRatio = typeTokenRatio;
        this.hapaxLegomenaRatio = hapaxLegomenaRatio;
        this.averageSentenceLength = averageSentenceLength;
        this.averageSentenceComplexity = averageSentenceComplexity;
    }
}
