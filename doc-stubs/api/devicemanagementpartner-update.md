---
title: "Update deviceManagementPartner"
description: "Update the properties of a deviceManagementPartner object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementPartner
Namespace: microsoft.graph



Update the properties of a [deviceManagementPartner](../resources/devicemanagementpartner.md) object.

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
PATCH /deviceManagement/deviceManagementPartners/{deviceManagementPartnerId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementPartner](../resources/devicemanagementpartner.md) object.

The following table shows the properties that are required when you update the [deviceManagementPartner](../resources/devicemanagementpartner.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Partner display name|
|groupsRequiringPartnerEnrollment|[deviceManagementPartnerAssignment](../resources/devicemanagementpartnerassignment.md) collection|User groups that specifies whether enrollment is through partner.|
|isConfigured|Boolean|Whether device management partner is configured or not|
|lastHeartbeatDateTime|DateTimeOffset|Timestamp of last heartbeat after admin enabled option Connect to Device management Partner|
|partnerAppType|deviceManagementPartnerAppType|Partner App type. Possible values are: `unknown`, `singleTenantApp`, `multiTenantApp`.|
|partnerState|deviceManagementPartnerTenantState|Partner state of this tenant. Possible values are: `unknown`, `unavailable`, `enabled`, `terminated`, `rejected`, `unresponsive`.|
|singleTenantAppId|String|Partner Single tenant App id|
|whenPartnerDevicesWillBeMarkedAsNonCompliant|DateTimeOffset|DateTime in UTC when PartnerDevices will be marked as NonCompliant. This will become obselete soon.|
|whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime|DateTimeOffset|DateTime in UTC when PartnerDevices will be marked as NonCompliant|
|whenPartnerDevicesWillBeRemoved|DateTimeOffset|DateTime in UTC when PartnerDevices will be removed. This will become obselete soon.|
|whenPartnerDevicesWillBeRemovedDateTime|DateTimeOffset|DateTime in UTC when PartnerDevices will be removed|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementPartner](../resources/devicemanagementpartner.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementpartner"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceManagementPartners/{deviceManagementPartnerId}
Content-Type: application/json
Content-length: 684

{
  "@odata.type": "#microsoft.graph.deviceManagementPartner",
  "displayName": "String",
  "groupsRequiringPartnerEnrollment": [
    {
      "@odata.type": "microsoft.graph.deviceManagementPartnerAssignment"
    }
  ],
  "isConfigured": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerAppType": "String",
  "partnerState": "String",
  "singleTenantAppId": "String",
  "whenPartnerDevicesWillBeMarkedAsNonCompliant": "String (timestamp)",
  "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime": "String (timestamp)",
  "whenPartnerDevicesWillBeRemoved": "String (timestamp)",
  "whenPartnerDevicesWillBeRemovedDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementPartner",
  "id": "7eb179fb-79fb-7eb1-fb79-b17efb79b17e",
  "displayName": "String",
  "groupsRequiringPartnerEnrollment": [
    {
      "@odata.type": "microsoft.graph.deviceManagementPartnerAssignment"
    }
  ],
  "isConfigured": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerAppType": "String",
  "partnerState": "String",
  "singleTenantAppId": "String",
  "whenPartnerDevicesWillBeMarkedAsNonCompliant": "String (timestamp)",
  "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime": "String (timestamp)",
  "whenPartnerDevicesWillBeRemoved": "String (timestamp)",
  "whenPartnerDevicesWillBeRemovedDateTime": "String (timestamp)"
}
```

