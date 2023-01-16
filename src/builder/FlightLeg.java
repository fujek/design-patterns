package builder;

public class FlightLeg {
    private final String from;
    private final String to;
    private final boolean delayed;
    private final int price;

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private final String from;
        private final String to;
        private boolean delayed;
        private Integer price;

        public FlightLegBuilder delayed(boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLeg build() {
            if (price == null) {
                throw new IllegalStateException("Empty required field - 'price'");
            }
            return new FlightLeg(this);
        }
    }

}
