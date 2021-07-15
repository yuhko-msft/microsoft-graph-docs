---
title: "Update tenantDetailedInformation"
description: "Update the properties of a tenantDetailedInformation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update tenantDetailedInformation
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [tenantDetailedInformation](../resources/managedtenants-tenantdetailedinformation.md) object.

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
PATCH /tenantRelationships/managedTenants/tenantsDetailedInformation/{tenantDetailedInformationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [tenantDetailedInformation](../resources/managedtenants-tenantdetailedinformation.md) object.

The following table shows the properties that are required when you update the [tenantDetailedInformation](../resources/managedtenants-tenantdetailedinformation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|city|String|**TODO: Add Description**|
|countryCode|String|**TODO: Add Description**|
|countryName|String|**TODO: Add Description**|
|defaultDomainName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|industryName|String|**TODO: Add Description**|
|region|String|**TODO: Add Description**|
|segmentName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|verticalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [tenantDetailedInformation](../resources/managedtenants-tenantdetailedinformation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_tenantdetailedinformation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/tenantsDetailedInformation/{tenantDetailedInformationId}
Content-Type: application/json
Content-length: 355

{
  "@odata.type": "#microsoft.graph.managedTenants.tenantDetailedInformation",
  "city": "String",
  "countryCode": "String",
  "countryName": "String",
  "defaultDomainName": "String",
  "displayName": "String",
  "industryName": "String",
  "region": "String",
  "segmentName": "String",
  "tenantId": "String",
  "verticalName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.tenantDetailedInformation",
  "id": "b43df956-f956-b43d-56f9-3db456f93db4",
  "city": "String",
  "countryCode": "String",
  "countryName": "String",
  "defaultDomainName": "String",
  "displayName": "String",
  "industryName": "String",
  "region": "String",
  "segmentName": "String",
  "tenantId": "String",
  "verticalName": "String"
}
```

