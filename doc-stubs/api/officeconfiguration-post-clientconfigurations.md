---
title: "Create officeClientConfiguration"
description: "Create a new officeClientConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create officeClientConfiguration
Namespace: microsoft.graph



Create a new officeClientConfiguration object.

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
POST /officeConfiguration/clientConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [officeClientConfiguration](../resources/officeclientconfiguration.md) object.

The following table shows the properties that are required when you create the [officeClientConfiguration](../resources/officeclientconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|checkinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|policyPayload|Stream|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|userCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description**|
|userPreferencePayload|Stream|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [officeClientConfiguration](../resources/officeclientconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_officeclientconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/officeConfiguration/clientConfigurations
Content-Type: application/json
Content-length: 423

{
  "@odata.type": "#microsoft.graph.officeClientConfiguration",
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "description": "String",
  "displayName": "String",
  "policyPayload": "Stream",
  "priority": "Integer",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "userPreferencePayload": "Stream"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.officeClientConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.officeClientConfiguration",
  "id": "4de2ae01-ae01-4de2-01ae-e24d01aee24d",
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "description": "String",
  "displayName": "String",
  "policyPayload": "Stream",
  "priority": "Integer",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "userPreferencePayload": "Stream"
}
```

