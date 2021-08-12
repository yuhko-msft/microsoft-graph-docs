---
title: "Create incident"
description: "Create a new incident object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create incident
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new incident object.

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
POST /security/incidents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [incident](../resources/incident.md) object.

The following table shows the properties that are required when you create the [incident](../resources/incident.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|incidentWebUrl|String|**TODO: Add Description**|
|redirectIncidentId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|assignedTo|String|**TODO: Add Description**|
|classification|m365AlertClassification|**TODO: Add Description**. Possible values are: `unknown`, `falsePositive`, `truePositive`, `benignPositive`, `unknownFutureValue`.|
|determination|m365AlertDetermination|**TODO: Add Description**. Possible values are: `unknown`, `apt`, `malware`, `securityPersonnel`, `securityTesting`, `unwantedSoftware`, `other`, `multiStagedAttack`, `compromisedUser`, `phishing`, `maliciousUserActivity`, `clean`, `insufficientData`, `confirmedUserActivity`, `lineOfBusinessApplication`, `unknownFutureValue`.|
|status|incidentStatus|**TODO: Add Description**. Possible values are: `active`, `resolved`, `redirected`, `unknownFutureValue`.|
|severity|m365AlertSeverity|**TODO: Add Description**. Possible values are: `unknown`, `informational`, `low`, `medium`, `high`, `unknownFutureValue`.|
|tags|String collection|**TODO: Add Description**|
|comments|[m365AlertComment](../resources/m365alertcomment.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [incident](../resources/incident.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_incident_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/security/incidents
Content-Type: application/json
Content-length: 454

{
  "@odata.type": "#microsoft.graph.incident",
  "incidentWebUrl": "String",
  "redirectIncidentId": "String",
  "displayName": "String",
  "lastUpdateDateTime": "String (timestamp)",
  "assignedTo": "String",
  "classification": "String",
  "determination": "String",
  "status": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "comments": [
    {
      "@odata.type": "microsoft.graph.m365AlertComment"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.incident"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.incident",
  "id": "eb558b72-8b72-eb55-728b-55eb728b55eb",
  "incidentWebUrl": "String",
  "redirectIncidentId": "String",
  "displayName": "String",
  "createdDateTime": "String (timestamp)",
  "lastUpdateDateTime": "String (timestamp)",
  "assignedTo": "String",
  "classification": "String",
  "determination": "String",
  "status": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "comments": [
    {
      "@odata.type": "microsoft.graph.m365AlertComment"
    }
  ]
}
```

