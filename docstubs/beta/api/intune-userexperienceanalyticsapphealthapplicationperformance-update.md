---
title: "Update userExperienceAnalyticsAppHealthApplicationPerformance"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update userExperienceAnalyticsAppHealthApplicationPerformance

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a userExperienceAnalyticsAppHealthApplicationPerformance object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http
/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{id}

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the userExperienceAnalyticsAppHealthApplicationPerformance object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a userExperienceAnalyticsAppHealthApplicationPerformance object.

| Property                 | Type   | Description                                                                                                                       |
| :----------------------- | :----- | :-------------------------------------------------------------------------------------------------------------------------------- |
| activeDevices            | Int32  | The number of devices where the app has been active. Valid values -2147483648 to 2147483647                                       |
| allOrgsHealthScore       | Double | The median health score of the application across all organizations. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 |
| allOrgsMeanTimeToFailure | Int32  | The median mean time to failure across all orgs for the app in minutes. Valid values -2147483648 to 2147483647                    |
| appFriendlyName          | String | The friendly name of the application.                                                                                             |
| appHealthScore           | Double | The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308                                         |
| appHealthStatus          | String | The overall health status of the app.                                                                                             |
| appName                  | String | The name of the application.                                                                                                      |
| appPublisher             | String | The publisher of the application.                                                                                                 |
| id                       | String | The unique identifier of the user experience analytics app performance object. Read-only.                                         |
| meanTimeToFailure        | Int32  | The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647                                           |
| memaTimeGenerated        | String | The time when aggregation was performed in MEMA.                                                                                  |
| tenantId                 | String | The id of the tenant associated with this app object.                                                                             |
| totalAppCrashes          | Int32  | The number of crashes for the app. Valid values -2147483648 to 2147483647                                                         |
| totalAppHangs            | Int32  | The number of hangs for the app. Valid values -2147483648 to 2147483647                                                           |
| totalAppUsageDuration    | Int32  | The total usage time of the application in minutes. Valid values -2147483648 to 2147483647                                        |

## Response

If successful, this method returns a `200 OK` response code and a userExperienceAnalyticsAppHealthApplicationPerformance object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsapphealthapplicationperformance"
}
-->

```http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{id}

Content-Type: application/json
Content-Length: 537

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "activeDevices": "Int32",
  "allOrgsHealthScore": "Double",
  "allOrgsMeanTimeToFailure": "Int32",
  "appFriendlyName": "String",
  "appHealthScore": "Double",
  "appHealthStatus": "String",
  "appName": "String",
  "appPublisher": "String",
  "meanTimeToFailure": "Int32",
  "memaTimeGenerated": "String",
  "tenantId": "String",
  "totalAppCrashes": "Int32",
  "totalAppHangs": "Int32",
  "totalAppUsageDuration": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsAppHealthApplicationPerformance"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "activeDevices": "Int32",
  "allOrgsHealthScore": "Double",
  "allOrgsMeanTimeToFailure": "Int32",
  "appFriendlyName": "String",
  "appHealthScore": "Double",
  "appHealthStatus": "String",
  "appName": "String",
  "appPublisher": "String",
  "id": "String(identifier)",
  "meanTimeToFailure": "Int32",
  "memaTimeGenerated": "String",
  "tenantId": "String",
  "totalAppCrashes": "Int32",
  "totalAppHangs": "Int32",
  "totalAppUsageDuration": "Int32"
}
}

```