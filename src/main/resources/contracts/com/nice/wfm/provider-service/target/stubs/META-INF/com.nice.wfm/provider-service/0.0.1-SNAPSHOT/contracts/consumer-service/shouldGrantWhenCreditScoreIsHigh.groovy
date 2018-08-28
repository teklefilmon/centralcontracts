import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/credit-scores'
        body """
            {
                "ssn": "12-34-5678"
            }
        """
        headers{
            contentType applicationJson()
        }
    }
    response {
        status 200
        body """
            {
                "creditScore": "HIGH"
            }
        """
        headers {
            contentType applicationJson()
        }
    }
}