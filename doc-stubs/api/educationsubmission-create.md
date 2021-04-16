---
title: "Create educationSubmission"
description: "Create a new educationSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationSubmission
Namespace: microsoft.graph



Create a new [educationSubmission](../resources/educationsubmission.md) object.

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
POST /education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationSubmission](../resources/educationsubmission.md) object.

The following table shows the properties that are required when you create the [educationSubmission](../resources/educationsubmission.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|recipient|[educationSubmissionRecipient](../resources/educationsubmissionrecipient.md)|**TODO: Add Description**|
|releasedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|releasedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourcesFolderUrl|String|**TODO: Add Description**|
|returnedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|returnedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|educationSubmissionStatus|**TODO: Add Description**. Possible values are: `working`, `submitted`, `released`, `returned`, `unknownFutureValue`.|
|submittedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|submittedDateTime|DateTimeOffset|**TODO: Add Description**|
|unsubmittedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|unsubmittedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationSubmission](../resources/educationsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationsubmission_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions
Content-Type: application/json
Content-length: 698

{
  "@odata.type": "#microsoft.graph.educationSubmission",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

