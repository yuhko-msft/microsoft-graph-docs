---
title: "Get educationSubmission"
description: "Read the properties and relationships of an educationSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get educationSubmission
Namespace: microsoft.graph



Read the properties and relationships of an [educationSubmission](../resources/educationsubmission.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions/{educationSubmissionId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [educationSubmission](../resources/educationsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_educationsubmission"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions/{educationSubmissionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationSubmission"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.educationSubmission",
    "id": "2b479152-9152-2b47-5291-472b5291472b",
    "recipient": {
      "@odata.type": "microsoft.graph.educationSubmissionRecipient"
    },
    "releasedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "releasedDateTime": "String (timestamp)",
    "resourcesFolderUrl": "String",
    "returnedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "returnedDateTime": "String (timestamp)",
    "status": "String",
    "submittedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "submittedDateTime": "String (timestamp)",
    "unsubmittedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "unsubmittedDateTime": "String (timestamp)"
  }
}
```

