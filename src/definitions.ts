export interface AndroidPostNotificationsPermissionPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
