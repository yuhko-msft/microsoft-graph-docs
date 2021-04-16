---
title: "Create windowsOfficeClientSecurityConfiguration"
description: "Create a new windowsOfficeClientSecurityConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsOfficeClientSecurityConfiguration
Namespace: microsoft.graph



Create a new [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsOfficeClientSecurityConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|checkinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|policyPayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userPreferencePayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|



## Response

If successful, this method returns a `201 Created` response code and a [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsofficeclientsecurityconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsOfficeClientSecurityConfiguration not found
Content-Type: application/json
Content-length: 438

{
  "@odata.type": "#microsoft.graph.windowsOfficeClientSecurityConfiguration",
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
  "@odata.type": "microsoft.graph.windowsOfficeClientSecurityConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsOfficeClientSecurityConfiguration",
  "id": "a0b80a79-0a79-a0b8-790a-b8a0790ab8a0",
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

