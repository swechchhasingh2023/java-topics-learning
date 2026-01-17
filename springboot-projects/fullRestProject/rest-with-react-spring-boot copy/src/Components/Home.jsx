// import { Button } from "bootstrap";
import { Button } from "reactstrap";
import { Card, CardBody, CardTitle } from "reactstrap";

function Home() {
  return (
    <div className="p-4">
      <Card className="text-center">
        <CardBody>
          <CardTitle tag="h1">Welcome!</CardTitle>
          <p>This is the home page 🚀</p>
          <Button color="primary" outline>
            Start Using
          </Button>
        </CardBody>
      </Card>
    </div>
  );
}

export default Home;
